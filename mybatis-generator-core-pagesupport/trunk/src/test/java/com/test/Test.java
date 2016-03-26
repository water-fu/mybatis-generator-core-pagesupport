package com.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ibatis.common.resources.Resources;

public class Test {

	/** 
     * 获得MyBatis SqlSessionFactory   
     * SqlSessionFactory负责创建SqlSession，一旦创建成功，就可以用SqlSession实例来执行映射语句，commit，rollback，close等方法。 
     * @return 
     */  
    private static SqlSessionFactory getSessionFactory() {  
        SqlSessionFactory sessionFactory = null;  
        String resource = "mybatis.xml";  
        try {  
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources  
                    .getResourceAsReader(resource));  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        return sessionFactory;  
    }  
  
    public static void main(String[] args) {  
//        SqlSession sqlSession = getSessionFactory().openSession();  
     /*   TabDeptMapper userMapper = sqlSession.getMapper(TabDeptMapper.class);  
        TabDeptExample example = new TabDeptExample();
        example.setLimitClauseStart(10);
        example.setLimitClauseCount(20);
        example.setOrderByClause("DEPT_ID");
       // example.createCriteria().andDeptIdEqualTo("0");
        List<TabDept> users = userMapper.selectByExample(example);
        TabDept user = users.get(0);
        System.out.println(user.getDeptName());  */
  
    }  
  
}
