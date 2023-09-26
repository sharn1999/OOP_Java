package Task3;

public class Temperature {
    private double degree;
    private char scale;
    Temperature(double degree){
        this.degree = degree;
        this.scale = 'C';
    }
    Temperature(char scale){
        this.degree = 0;
        this.scale = scale;
    }
    Temperature(double degree, char scale){
        this.degree = degree;
        this.scale = scale;
    }

    Temperature(){
        this.degree = 0;
        this.scale = 'C';
    }

    double temperatureC(double degreesF){
        return 5 * (degreesF-32)/9;
    }
    double temperatureF(double degreesC){
        return 9 * (degreesC/5) + 32;
    }

    void setDegree(double degree){
        this.degree = degree;
    }
    void setScale(char scale){
        this.scale = scale;
    }

    void setAll(double degree, char scale){
        this.degree = degree;
        this.scale = scale;
    }

    char getScale(){
        return this.scale;
    }
    double getDegree(){
        return this.degree;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        System.out.println(t.getScale());
        System.out.println(t.getDegree());
        System.out.println(t.temperatureC(245));
        System.out.println(t.temperatureF(20));
        t.setAll(20, 'F');
        System.out.println(t.getScale());
        System.out.println(t.getDegree());
    }
}
