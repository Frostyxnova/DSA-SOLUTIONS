class MedianFinder {
PriorityQueue<Integer> minHeap, maxHeap;
boolean even;
    public MedianFinder() {
    minHeap = new PriorityQueue<>();
    maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    even = true;
    }
    
    public void addNum(int num) {
        if(even){
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        else{
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        even = !even;
        
        
    }
    
    public double findMedian() {
        if(even){
           return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
        else{
            return (double)maxHeap.peek();
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */