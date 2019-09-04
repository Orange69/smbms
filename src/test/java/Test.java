import com.githup.mybatis.pojo.Provider;
import com.githup.mybatis.pojo.User;
import com.githup.mybatis.util.sqlsessionUtil;
import org.apache.ibatis.session.SqlSession;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
public static void main(String[] args) {
	InputStream is;
	try {
		SqlSession sqlSession = sqlsessionUtil.getSqlsession();
		//执行配置文件中的sql语句  填命名空间.方法名(查询次数)
		int count = sqlSession.selectOne("userMapper.findCountUser");
		
		//执行查询用户的操作  获取list类型的列表
		List<User> selectList = sqlSession.selectList("userMapper.findUser");

		for (User user : selectList) {
			System.out.println(user);
		}
		 
		//查询供应商
		List<Provider> selectList2 = sqlSession.selectList("userMapper.findprovider");
		for (Provider provider : selectList2) {
			System.out.println(provider);
		}
		System.out.println("超市会员总共有："+count);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
