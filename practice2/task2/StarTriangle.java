package task2;

public class StarTriangle {
    int width;
    StarTriangle(int width){
        this.width = width;
    }

    String toString1(){
        String s = "";
        for (int i = 0; i<width; i++){
            for(int j = 0; j<=i; j++){
                s +="[*]";
            }
            s+="\n";
        }
        return s;
    }

    public static void main(String[] args) {
        StarTriangle st = new StarTriangle(5);
        System.out.println(st.toString1());
    }
}
