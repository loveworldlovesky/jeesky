package demos.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyJob implements Job{
	private static Logger log = LoggerFactory.getLogger(MyJob.class);
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		log.info("hello,我的第一个任务调度程序");
		//test git update
		System.out.println("test");
	}

}
