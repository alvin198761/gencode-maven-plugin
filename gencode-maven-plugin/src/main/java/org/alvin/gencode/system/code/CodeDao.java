package org.alvin.gencode.system.code;

import com.google.common.base.CaseFormat;
import lombok.extern.slf4j.Slf4j;
import org.alvin.code.jdbc.ConnectionUtils;
import org.alvin.code.jdbc.JDBCBaseDao;
import org.alvin.code.jdbc.utils.SqlUtil;
import org.alvin.gencode.utils.Utils;
import org.alvin.mini_inject.annotations.MiniComponent;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@MiniComponent
public class CodeDao extends JDBCBaseDao {

    /**
     * @功能描述: 查询表名列表
     */
    public List<Table> queryTables(CodeCond cond) throws SQLException {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT table_name t_name,if(table_comment='',table_name,table_comment) comment FROM information_schema.tables WHERE 1=1");
        sb.append(cond.getCondition());
        log.info(SqlUtil.showSql(sb.toString(), cond.getArray()));
        return this.queryList(sb.toString(), cond, Table.class).stream().map(item -> {
            item.setCls_upp(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, Utils.delFirWord(item.getT_name())));
            item.setC_name(item.getComment());
            return item;
        }).collect(Collectors.toList());
    }

    /**
     * @功能描述: 查询字段名列表
     */

    public List<Field> queryFields(CodeCond cond) throws SQLException {
        StringBuilder sb = new StringBuilder();
        sb.append(" SELECT COLUMN_NAME NAME,");
        sb.append(" CASE WHEN COLUMN_COMMENT = '' THEN COLUMN_NAME ELSE COLUMN_COMMENT	END COMMENT,");
        sb.append(
                " CASE WHEN DATA_TYPE='varchar' OR DATA_TYPE='text' OR DATA_TYPE='char' OR DATA_TYPE='longtext' OR DATA_TYPE='mediumtext' THEN 'java.lang.String'");
        sb.append(" WHEN DATA_TYPE = 'tinyint' THEN 'java.lang.Byte'");
        sb.append(" WHEN DATA_TYPE = 'smallint' THEN 'java.lang.Short'");
        sb.append(" WHEN DATA_TYPE = 'int' OR DATA_TYPE = 'mediumint' THEN 'java.lang.Integer'");
        sb.append(
                " WHEN DATA_TYPE = 'datetime' OR DATA_TYPE = 'timestamp' OR DATA_TYPE = 'date' OR DATA_TYPE = 'time' THEN 'java.util.Date'");
        sb.append(" WHEN DATA_TYPE = 'bigint' THEN 'java.lang.Long'");
        sb.append(" WHEN DATA_TYPE = 'float' THEN 'java.lang.Float'");
        sb.append(" WHEN DATA_TYPE = 'double' THEN 'java.lang.Double'");
        sb.append(" WHEN DATA_TYPE = 'decimal' THEN 'java.math.BigDecimal'");
        sb.append(" WHEN DATA_TYPE = 'boolean' OR DATA_TYPE = 'bit' THEN 'java.lang.Boolean'");
        sb.append(" ELSE CONCAT ('无效数据类型', DATA_TYPE) END allTypeName");
        sb.append(" ,character_maximum_length as length ");
        sb.append(" ,column_key as column_key ");
        sb.append(" ,upper(DATA_TYPE) as dbType ");
        sb.append(" FROM INFORMATION_SCHEMA.COLUMNS WHERE 1 = 1");
        sb.append(cond.getCondition());
        sb.append(" ORDER BY ORDINAL_POSITION");
        log.info(SqlUtil.showSql(sb.toString(), cond.getArray()));
        return this.queryList(sb.toString(), cond, Field.class);
    }

}
