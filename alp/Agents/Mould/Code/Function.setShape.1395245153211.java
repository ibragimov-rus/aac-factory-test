for(int i = 0; i < mouldShape.size(); i++){
	ShapeGroup sg = (ShapeGroup)mouldShape.get(i);
	if(sg == shape)
		sg.setVisible(true);
	else
		sg.setVisible(false);
}