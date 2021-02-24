package com.example.demoj;

/*public class HashMap<K,V> implements Map<K,V> {
    private Entry[] table=null;
    int size=0;

    public HashMap() {
         table=new Entry[16];
    }

    @Override
    public V get(K k) {
        int index = hash(k);
        Entry entry = table[index];
        if (entry==null){
            return null;
        }
        if (k==entry.k || k.equals(entry.k)){
            return (V) entry.getValue();
        }else {
            if (entry.next!=null){
                if (k==entry.next||k.equals(entry.next)){
                    return (V) entry.getValue();
                }
            }else {
                return null;
            }

        }
        return null;
    }

    @Override
    public V put(K k, V v) {
       int index=hash(k);
        Entry<K,V> entry = table[index];
        if (entry==null){
            table[index]=new Entry(k,v,index,null);
            size++;
        }else {
            table[index]=new Entry(k,v,index,entry);
        }
        return (V) table[index].getValue();
    }

    private int hash(K k) {
        int i = k.hashCode() % 16;
        return Math.abs(i);
    }

    @Override
    public int size() {
        return size;
    }
    class Entry<K,V> implements Map.Entry<K,V>{
        K k;
        V v;
        int hash;
        Entry<K,V> next;

        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;

        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }
}*/
public class HashMap<K,V> implements Map<K,V>{
    private Entry[] table=null;
    int size=0;

    public HashMap() {
        table=new Entry[16];
    }

    @Override
    public V get(K k) {
        int index = hash(k);
        Entry entry = table[index];
        if (entry==null){
            return null;
        }


       do {
           if (k==entry.getKey()||k.equals(entry.getKey())){
               return (V) entry.getValue();
           }
           entry=entry.next;
       }while (entry!=null);
         return null;
    }

    @Override
    public V put(K k, V v) {
        int index = hash(k);
        Entry entry = table[index];
        if (entry==null){
            table[index]=new Entry(k,v,index,null);
            size++;
        }else {
            table[index]=new Entry(k,v,index,entry);
        }

        return (V) table[index].getValue();
    }

    @Override
    public int size() {
        return size;
    }

    private int hash(K k) {
        int i = k.hashCode() % 16;
        return Math.abs(i);
    }

    class Entry<K,V> implements Map.Entry<K,V>{
        K k;
        V v;
        int hash;
        Entry<K,V> next;

        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }
}
