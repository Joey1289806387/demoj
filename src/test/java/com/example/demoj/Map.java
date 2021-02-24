package com.example.demoj;

import org.omg.CORBA.PUBLIC_MEMBER;

public interface Map<K,V> {
    public V get(K k);
    public V put(K k,V v);
    public int size();
    public interface Entry<K,V>{

        public K getKey();
        public V getValue();
    }

}
/*public interface Map<K,V>{
    public  V get(K k);
    public V put(K k,V v);
    public int size();
    public interface Entry<K,V>{
        public K getKey();
        public V getValue();
    }
}*/
