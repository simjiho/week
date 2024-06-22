package com.web.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionTemplate {

    /**
     * MyBatis SqlSession 객체를 반환하는 메소드.
     * @return SqlSession 객체
     */
    public static SqlSession getSession() {
        SqlSession session = null; // SqlSession 객체 초기화

        String fileName = "/board/mybatis/config.xml"; // MyBatis 설정 파일명

        try (InputStream is = Resources.getResourceAsStream(fileName)) {
            // config.xml 파일을 읽어옴
            // try-with-resources 구문을 사용하여 InputStream 자원을 안전하게 열고 자동으로 닫음

            // SqlSessionFactoryBuilder를 사용하여 SqlSessionFactory 생성
            // build(is) 메소드로 InputStream에서 SqlSessionFactory를 빌드
            // openSession(false)로 SqlSession 객체 생성 (false는 수동 커밋)
        	
            session = new SqlSessionFactoryBuilder().build(is).openSession(false);
        } catch (IOException e) {
            e.printStackTrace(); 
        }

        return session; // 생성된 SqlSession 객체 반환
    }
}
