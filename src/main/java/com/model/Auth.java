package com.model;

/**
 * project_name:member_manage
 * package_name:model
 * user: youzipi
 * date: 15-11-9 上午11:49
 */
public class Auth {

    public static int add = 3; // 增加权限十进制表示
    public static int del = 4; // 删除权限十进制表示
    public static int update = 5; // 更新权限十进制表示

    public static int base = 2;// 该数字可以是一个范围

    /**
     * 增加权限
     * @param permission
     * @param operate
     */
    public static int addPermission(int permission, int operate) {
        int per = base<<operate;
        permission |= per; //增加权限时使用或，可以将权限对应的二进制位的1赋值给权限变量的0
        return permission;
    }

    public static int delPermission(int permission, int operate){
        int per = base<<operate;
        per = ~per; // 按位取反，取反之前的1，取反后变为0，再和权限数字进行与运算，1&0=0,1&1=1，0&1=0，这样删除对应权限，并且不影响原有权限
        return permission & per;
    }

    public static boolean check(int permission, int operate) {
        int per = base<<operate;
        return (permission & per) == per; // 1&0=0;1&1=1;0&1=0; permission和per&操作之后，如果permission对应的位为1，则和per&的结果就等于per
    }

    public static void printPermission(int permission) {
        int binaryAdd = base<<add;
        int binaryDel = base<<del;
        int binaryUpdate = base<<update;
        System.out.println("===Permission====");
        System.out.println("当前用户是否有add权限：" + ((permission & binaryAdd) == binaryAdd));
        System.out.println("当前用户是否有del权限：" + ((permission & binaryDel) == binaryDel));
        System.out.println("当前用户是否有update权限：" + ((permission & binaryUpdate) == binaryUpdate));
    }

    public static void main(String[] args) {
        System.out.println(base);
        int permission = 0;
        System.out.println("是否有增加权限：" + check(permission, add));
        // 赋权-增加权限
        permission = Auth.addPermission(permission, add);
        System.out.println("是否有增加权限：" + check(permission, add));
        // 赋权-删除权限
        permission = Auth.addPermission(permission, del);
        System.out.println("是否有删除权限：" + check(permission, del));
        // 解除权限
        permission = Auth.delPermission(permission, add);
        System.out.println("是否有增加权限：" + check(permission, add));
        // 赋权-更新权限
        permission = Auth.addPermission(permission, update);
        System.out.println("是否有更新权限：" + check(permission, update));

        // 查看用户有哪些权限
        printPermission(permission);
    }
}
