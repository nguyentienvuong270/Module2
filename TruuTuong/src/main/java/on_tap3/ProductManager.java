package on_tap3;

interface Manager2 {
    void add2();
}

public class ProductManager implements Manager, Manager2 {
    @Override
    public void add() {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public String[] getAll() {
        return new String[0];
    }

    @Override
    public void add2() {

    }
}
