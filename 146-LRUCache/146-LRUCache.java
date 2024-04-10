            map[key] = node;
            if (count < capacity) {
                count++;
                addToHead(node);
            } else {
                map[tail.prev.key] = null;
                deleteNode(tail.prev);
                addToHead(node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
[
