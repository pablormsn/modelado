public class FactoryX {
    public X create(Object obj, XService xService){
        return new XProxy(obj, xService);
    }
}
