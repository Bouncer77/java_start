package cat_family;

import cat_family.CatFamily;

public class Leon extends CatFamily {

    public Leon() {
        //setBigClaws(true);
        super(2, 4, true);
    }

    @Override
    public void eat() {
        System.out.println("Кушаю Антилопу");
    }
}
