package polymorphism.ex.ex4;

import access_modifier.second.C;

public class Main {
    public static void main(String[] args) {
        Cookie g = new GingerbreadCookie();
        Cookie c = new ChocoCookie();
        Cookie s = new StrawberryCookie();

        g.run();
        g.jump();

        s.run();
        s.jump();
        specialSkill(s);

        c.run();
        c.jump();
        specialSkill(c);
    }
    static void specialSkill(Cookie cookie){
        if (cookie instanceof StrawberryCookie) {
            StrawberryCookie s1 = (StrawberryCookie) cookie;
            s1.specialSkill();
        } else if (cookie instanceof ChocoCookie) {
            ChocoCookie c1 = (ChocoCookie) cookie;
            c1.specialSkill();
        }
    }
}
