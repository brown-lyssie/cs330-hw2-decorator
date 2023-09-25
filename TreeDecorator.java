class TreeDecorator extends Tree {
    Tree decoratedTree;
    TreeDecorator(Tree t) {
        System.out.println("TreeDecorator");
        decoratedTree = t;
    }
    public int getCost() {
        return decoratedTree.getCost() + cost;
    }
}