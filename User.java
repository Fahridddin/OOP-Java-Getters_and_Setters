public class User {
    private String name;
    private String membership;
    void set_name(String name){ //This is needed to give a value
        // System.out.print("1"); can be used but it will print 1 x times(x = number of startups);

        this.name = name; //_name can also be used instead of this.name
    }

    String get_name() { //This is needed to get the value
        return name;
    }
    void set_membership(String membership) {
        this.membership=membership;
    }
    String get_membership() {
        return membership;
    }
}