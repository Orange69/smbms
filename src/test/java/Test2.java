import com.githup.mybatis.dao.UserMapper;
import com.githup.mybatis.pojo.User;
import com.githup.mybatis.util.sqlsessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test2 {
public static void main(String[] args) {
	SqlSession sqlSession;
	try {
		//获取session对象
		sqlSession =sqlsessionUtil.getSqlsession();
		//通过sqlsession获取UserMapper对象
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		//通过UserMapper来执行各种操作
		//List<User> userList=userMapper.findUser();
		//迭代userList
//		for (User user : userList) {
//			System.out.println(user);
//		}


		//通过名字来模糊查询用户
//		User user=userMapper.findUserByUserName("敏");
//		System.out.println(user);

		//第一种:使用对象来传多个参数
//		User user=new User();
//		user.setUserName("敏");
//		user.setUserRole(2);
//		user=userMapper.findUserByUserNameAndUserRole(user);
//		System.out.println(user);

		//第二种：使用map集合来传参数
//		Map<String,Object> map=new HashMap<>();
//		map.put("userName","敏");
//		map.put("userRole",2);
//		User user=userMapper.findUserByMap(map);
//		System.ut.println(user);
		//第三种:多个参数
		//如果两个参数以内包含两个参数推荐用注解传参，两个以上推荐多个参数，不在一个对象里面推荐map
		User user=userMapper.findUserByUserNameAndUserRole1("敏",2);
		System.out.println(user);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
