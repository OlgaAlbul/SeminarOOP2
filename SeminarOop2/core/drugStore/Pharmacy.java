package core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterable <Component>, Comparable<Pharmacy>, Marker {
    private List<Component> components;
    private int componentsCount;
    private int id;

    public Pharmacy(int id){
        this.components = new ArrayList<>();
        this.componentsCount = 0;
        this.id  = id;
    }

    public Pharmacy addComponent(Component component){
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents(){
        return components;
    }

    @Override
    public String toString(){
        return "Pharmacy{" + "components=" + 
        components + ", index" + componentsCount + "}" + "\n";
    }

    @Override
    public Iterator<Component> iterator(){
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o){
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        int result;
        result = Integer.compare(pow1, pow2);
        if (Integer.compare(pow1, pow2) == 0) {
            String Coll1 = getStr(this);
            String Coll2 = getStr(o);
            result = CharSequence.compare(Coll1,Coll2);
        }
        return result;
    }

    private String getStr(Pharmacy pharm) {
        String cStr = "";
        for (Component elem: pharm.getComponents()) {
            cStr += elem.getName();
            System.out.println(cStr);
        }
        return cStr;

    }

    private int getPower(Pharmacy pharm){
        int result = 0;
        for (Component elem: pharm.getComponents()){
            result+=elem.getPower();
        }
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy that = (Pharmacy) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
