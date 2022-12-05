package com.advent.d04;

public class Section {
    private int left;
    private int right;

    public Section(String assignment) {
        int sepparatorPos = assignment.indexOf("-");
        left = Integer.parseInt(assignment.substring(0,sepparatorPos));
        right = Integer.parseInt(assignment.substring(sepparatorPos+1));
    }
    public boolean fullOverlap(Section other){
        return (this.left <= other.left && this.right >= other.right) ||
                (this.left >= other.left && this.right <= other.right);
    }
    public boolean partOverlap(Section other){
        if( (this.left <= other.left && this.right >= other.left) ||
               (this.left <= other.right && this.right >= other.right)){
            return true;
        }

        return (other.left <= this.left && other.right >= this.left) ||
               (other.left <= this.right && other.right >= this.right);
    }
}
