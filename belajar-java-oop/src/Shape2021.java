class Shape2021 {

    int getCorner() {
        return 0;
    }
}

class Rectangle2021 extends Shape2021 {
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        return super.getCorner();
    }
}
