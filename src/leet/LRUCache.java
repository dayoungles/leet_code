package leet;

import leet.model.DoubleLinkedNode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Map<Integer, Integer> cache;
    int capa;
    int listSize = 0;
    DoubleLinkedNode head;
    DoubleLinkedNode tail;

    public LRUCache(int capacity) {
        this.capa = capacity;
        this.cache = new HashMap<>();
        head = new DoubleLinkedNode(0,0);
        tail = new DoubleLinkedNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        //키가 있으면 헤드로 갱신
        if(cache.containsKey(key)){
            updateNode(new DoubleLinkedNode(key, cache.get(key)));
            return cache.get(key);
        }
        //키가 없으면
        return -1;
    }

    public void put(int key, int value) {
        //키가 있으면 헤드로 갱신
        if(cache.containsKey(key)){
            updateNode(new DoubleLinkedNode(key, value));
            return;
        }
        //키가 없으면 캐시에 넣어주고, 헤드로 넣어주고, 링크드 리스트 사이즈도 늘려줘.
        cache.put(key, value);
        insertNode(new DoubleLinkedNode(key, value));
        listSize++;
        //문제는 사이즈가 카파보다 늘어났을 때, 그 때는 젤 안 쓰인 노드를 뽑아주고, 캐시에서도 빼줘야됨.
        // 잘 끝나면 사이즈 줄여줘
        if(capa < listSize){
            DoubleLinkedNode lastNode = removeLastNode();
            cache.remove(lastNode.key);
            listSize--;
        }
    }

    private void insertNode(DoubleLinkedNode node){


        // node를 헤드 앞에 새로 붙여주기
        DoubleLinkedNode second = this.head.next;
        this.head.next = node;
        node.prev = head;
        node.next = second;
        second.prev = node;
    }

    private void updateNode(DoubleLinkedNode node){
        //기존 노드는 삭제하고
        removeNode(node);
        //헤드 앞에 새로 붙여주기
        insertNode(node);
    }

    private void removeNode(DoubleLinkedNode node){
        // 자기의 넥스트와 자기의 프리브를 연결해주기
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private DoubleLinkedNode removeLastNode(){
        // tail의 프리브 노드 삭제하고
        DoubleLinkedNode last = this.tail.prev;
        // tail.prev.prev와  tail을 연결해주기
        this.tail.prev = last.prev;
        last.prev.next = this.tail;

        return last;
    }



}
