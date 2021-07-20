package shapes;


abstract class GraphicObject {
//define member variables- variables that will/can be used by all subclasses
//define a sha;pes's starting position using x and y

int x, y;

//non-abstract (regular) method that can be implemented the same no matter what the subclass is
    void moveTo(int newX, int newY){
        System.out.printf("this shape's new coordinates are: %s, %s ", newX, newY);
    }


    //abstract methods, that can be used by every subclass of GraphicObject, but will be implemented
    // differently

    //draw, resize, fillColor

    abstract void draw();
    abstract void resize();
    abstract void fillColor();

    }

