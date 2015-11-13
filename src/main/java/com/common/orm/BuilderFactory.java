package com.common.orm;


import com.entity.User;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * project_name:member_manage
 * package_name:common
 * user: youzipi
 * date: 15-11-8 下午7:51
 * <p>
 * 参考自Django ORM
 */
public class BuilderFactory {


    public static class Builder {
        private String table;
        private StringBuilder sql;
        private List<String> select;
        private List<String> where;
        private List<String> orders;
        private String orderMark = SQLConstants.ASC;

        public Builder(Class clazz) {
            table = underscored(clazz.getSimpleName());
            where = new ArrayList<>();
            select = new ArrayList<>();
            orders = new ArrayList<>();
            sql = new StringBuilder();
        }

        public Builder order(String fieldNames) {
            if (fieldNames.substring(0, 1).equals("-")) {
                orders.add(fieldNames.substring(1));
                orderMark = SQLConstants.DESC;
            } else {
                orders.add(fieldNames);
                orderMark = SQLConstants.ASC;

            }
            return this;
        }

        public Builder filter(String... fields) {
            return filter_or_exclude(false, fields);
        }

        public Builder exclude(String... fields) {
            return filter_or_exclude(true, fields);
        }

        private Builder filter_or_exclude(boolean negate, String... fields) {
            if (negate) {
                //todo 检查传入的fields与对象fields
                // hasAttr(field,class)
                Collections.addAll(select, fields);
            } else {
                Collections.addAll(select, fields);
            }
            return this;
        }

        public String build() {
            sql.append(SQLConstants.SELECT);
            if (select.size() > 0) {
                buildPart(select);
            } else {
                sql.append('*');
            }

            sql.append(SQLConstants.FROM).append(table);

            if (where.size() > 0) {
                buildPart(SQLConstants.WHERE, where);
            }

            if (orders.size() > 0) {
                buildOrder(SQLConstants.ORDER_BY, orders);
            }

            sql.append(';');
            return sql.toString();
        }

        private void buildOrder(String orderBy, List<String> orders) {
            buildPart(orderBy, orders);
            sql.append(orderMark);
        }

        private void buildPart(String keywords, List<String> fields) {
            sql.append(keywords);
            buildPart(fields);
        }

        private void buildPart(List<String> fields) {
            for (String s : fields) {
                sql.append(s).append(',');
            }
            //erase the last ','
            sql.replace(sql.length() - 1, sql.length(), "");
        }

        /**
         *
         */
        public void execute() {
            build();
            //todo

        }

    }


    public static String underscored(String old) {
        if (StringUtils.isBlank(old)) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char[] charArray = old.toCharArray();

        for (char c : charArray) {
            if (c <= 'Z') {
                result.append("_");
                c += 32;
            }
            result.append(c);
        }
        return result.toString().substring(1);
    }

    public static void main(String[] args) {
        String sql = new BuilderFactory.Builder(User.class).filter("id", "name", "add_time").order("-add_time").build();
        System.out.println(sql);
    }
}
