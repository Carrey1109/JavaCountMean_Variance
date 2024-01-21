package mis.oop;
import mis.oop.Stat;

public class TeacherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//以下參數內容，個數會任意變化，不限個數，不限正負值
		Stat hwTest= new Stat (1,5,3,3, 1,2,3,5,1,2,3,3,1);
		//期望值
		double ex=hwTest.stat_mean();
		//變異數
		double myvar=hwTest.stat_variance();
		//標準差
		double mystd=hwTest.stat_std();
		System.out.printf("期望值為：%8.3f，變異數：%8.3f，標準差 %8.3f%n",
		ex, myvar,mystd);
	}

}
