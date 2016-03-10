
package uits.jv1503.interfaces;

public class FoodProcessor implements ICutter, IPeeler, ISlicer{

    @Override
    public double cut(Plant a){
        if (!a.peeled) {
            throw new IllegalArgumentException("This is not peeled!");
        }
        a.weight = a.weight * 0.98;
        return a.weight;
    }

    @Override
    public double cutAll(Plant[] a) {
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

    @Override
    public Plant peelItem(Plant a) {
        if (!a.peeled) {
            a.weight*= 0.95;
            a.peeled = true;
        }
        return a;
    }

    @Override
    public Plant[] peelItems(Plant[] a) {
        Plant[] peeledA = new Plant[a.length];
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
    public double slice(Plant a) {
        if (!a.peeled) {
            throw new IllegalArgumentException("This is not peeled!");
        }
        a.weight = a.weight * 0.98;
        return a.weight;
    }

    @Override
    public double sliceAll(Plant[] a) {
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
}

    
    
    
    
    

