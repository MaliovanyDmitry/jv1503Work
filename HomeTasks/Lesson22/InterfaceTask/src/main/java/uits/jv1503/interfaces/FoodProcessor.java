
package uits.jv1503.interfaces;

public class FoodProcessor implements ICutter, IPeeler, ISlicer{

    @Override
    public double cut(Att a){
        if (!a.peeled) {
            throw new IllegalArgumentException("This is not peeled!");
        }
        a.weight = a.weight * 0.98;
        return a.weight;
    }

    @Override
    public double cutAll(Att[] a) {
        double summWeight = 0.0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].peeled) {
                throw new IllegalArgumentException("This is not peeled!");
            }
            a[i].weight = a[i].weight * 0.98;
            summWeight += a[i].weight;
        }
        System.out.println("Вес нашинкованных продуктов составляет: " + summWeight);
        return summWeight;
    }

    @Override
    public Att peelItem(Att a) {
        if (!a.peeled) {
            a.weight*= 0.95;
            a.peeled = true;
        }
        return a;
    }

    @Override
    public Att[] peelItems(Att[] a) {
        Att[] peeledA = new Att[a.length];
        for (int i = 0; i < a.length; i++) {
            if (!a[i].peeled) {
                a[i].weight*= 0.95;
                a[i].peeled = true;
            }
            peeledA[i] = a[i];
        }
        return peeledA;
    }

    @Override
    public double slice(Att a) {
        if (!a.peeled) {
            throw new IllegalArgumentException("This is not peeled!");
        }
        a.weight = a.weight * 0.98;
        return a.weight;
    }

    @Override
    public double sliceAll(Att[] a) {
        double summWeight = 0.0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].peeled) {
                throw new IllegalArgumentException("This is not peeled!");
            }
            a[i].weight = a[i].weight * 0.98;
            summWeight += a[i].weight;
        }
        System.out.println("Вес нарезанных продуктов составляет: " + summWeight);
        return summWeight;
    }
}

    
    
    
    
    

