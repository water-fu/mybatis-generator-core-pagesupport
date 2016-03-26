
import org.mybatis.generator.api.ShellRunner;

/**
 * 
 */

/**
 * @author yangqx
 *
 */
public class DaoGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//ShellRunner.main(new String[]{"-configfile", "/home/yangqx/work/share/workspace/zj/mybatis-demo/src/test/resources/generatorConfig-oracle.xml", "-overwrite"});
		/*String mysql_config="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-mysql.xml";
		String mysql_report_config="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-mysql-report.xml";
		
		
		String oracle_report_config="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-oracle-report.xml";
		
		
		String oralce_report_bi_config="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-oracle-report-bi.xml";
		
		
		String oralce_report_SYS_config="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-oracle-system.xml";
		
		
		String common="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-mysql-system.xml";
		
		String oracle_youni3_0_config="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-oracle-youni3.0.xml";
		
		String mysql_youni3_0_config="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-mysql-youni3.0.xml";
		
		String epay_config="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-mysql-epay.xml";
		
		String gen_dev="/home/yangqx/work/share/workspace/zj/mybatis-generator-core-pagesupport/src/test/resources/generatorConfig-oracle-dev.xml";*/
//		String mysql_config=DaoGenerator.class.getResource("/generatorMybatis-oracle.xml").getPath();
		String mysql_config=DaoGenerator.class.getResource("/generatorMybatis-mysql.xml").getPath();

		ShellRunner.main(new String[]{"-configfile", mysql_config, "-overwrite"});
	}

}
