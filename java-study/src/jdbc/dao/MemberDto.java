package jdbc.dao;

public class MemberDto {
    // 데이터를 전달할 컬럼 (DB의 컬럼과 일치)
    private String id;
    private String name;
    private String email;

    // 생성자
    public MemberDto(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    // getter, setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
