package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by ${laotizi} on 2018-04-19.
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }

    public interface Cart{
        int CHECKED = 1; //购物车选中状态
        int UN_CHECKED = 0; //购物车未选中状态

        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS";
    }

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc","price_asc");
    }

    public enum ProductStatusEnum{
        ON_Sale(1,"在线");

        private int coed;
        private String value;

        ProductStatusEnum(int code,String value){
            this.coed = code;
            this.value = value;
        }

        public int getCoed() {
            return coed;
        }

        public String getValue() {
            return value;
        }
    }
}
