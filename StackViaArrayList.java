import java.util.ArrayList;

class SAL {
    ArrayList<Integer> a = new ArrayList<Integer>();

    public void pushElement(){
        a.add(30);
        a.add(20);
        a.add(40);
        a.add(70);
    }

    public void popElement(){
        a.remove(a.size()-1);
    }

    public void peekElement(){
        System.out.println(a.get(a.size()-1));
    }
     public static void main(String[] args) {
        SAL s = new SAL();
        s.pushElement();
        s.popElement();
        s.peekElement();
     }
}
