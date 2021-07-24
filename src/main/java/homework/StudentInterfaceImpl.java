package homework;

import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

public class StudentInterfaceImpl implements StudentInterface{
    @Override
    public String showName(String studentNumber) {
        if("20210000000000".equals(studentNumber)){
            return null;
        }else if("20210123456789".equals(studentNumber)){
            return "心心";
        }else {
            return "未知！";
        }
    }

    @Override
    public long getProtocolVersion(String s, long l) throws IOException {
        return StudentInterface.versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return null;
    }
}
