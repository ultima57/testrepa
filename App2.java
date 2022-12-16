package room1;

public class App2 {

    public static void main(String[] args) {
        for (int i = 0; i < 57; i++) {
            System.out.println("i**2=" + i * i);
            System.out.println("abaaba");

        }
    }
}

class Vodoxlebus {
    private String woda;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((woda == null) ? 0 : woda.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vodoxlebus other = (Vodoxlebus) obj;
        if (woda == null) {
            if (other.woda != null)
                return false;
        } else if (!woda.equals(other.woda))
            return false;
        return true;
    }

}