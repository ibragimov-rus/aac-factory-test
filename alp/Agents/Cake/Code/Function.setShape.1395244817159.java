for(int i = 0; i < cakeShape.size(); i++){
	ShapeGroup sg = (ShapeGroup)cakeShape.get(i);
	if(sg.equals(shape))
		sg.setVisible(true);
	else
		sg.setVisible(false);
}
