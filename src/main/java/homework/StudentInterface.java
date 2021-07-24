package homework;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface StudentInterface extends VersionedProtocol {

    long versionID = 0;

    /**
     * @param studentNumber  接收学号
     * @return 返回学生姓名
     */
    String showName(String studentNumber);

}
