blocks++;
cakes.add(cake);
cake.setSpace(this);
cake.setNetworkNode(getCakePosition(blocks));
presentation.remove(text);
presentation.add(text);
cake.state = PLACED_TO_BOGEY;
main.DBWrite(cake);