public class UserVo {
    String str;

    public UserVo() {
    }

    public UserVo(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "str='" + str + '\'' +
                '}';
    }
}
