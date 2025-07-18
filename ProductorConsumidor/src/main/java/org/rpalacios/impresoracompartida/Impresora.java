package org.rpalacios.impresoracompartida;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Impresora implements BlockingQueue<String> {
     BlockingQueue<String> bq = new LinkedBlockingQueue<>(5);
public static final String FIN = "FIN";
    @Override
    public boolean add(String s) {
        return false;
    }

    @Override
    public boolean offer(String s) {
        return false;
    }

    @Override
    public String remove() {
        return "";
    }

    @Override
    public String poll() {
        return "";
    }

    @Override
    public String element() {
        return "";
    }

    @Override
    public String peek() {
        return "";
    }

    @Override
    public void put(String doc) throws InterruptedException {
        bq.put(doc);
    }

    @Override
    public boolean offer(String s, long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public String take() throws InterruptedException {
        return bq.take();
    }

    @Override
    public String poll(long timeout, TimeUnit unit) throws InterruptedException {
        return "";
    }

    @Override
    public int remainingCapacity() {
        return 0;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public int drainTo(Collection<? super String> c) {
        return 0;
    }

    @Override
    public int drainTo(Collection<? super String> c, int maxElements) {
        return 0;
    }
}
