//return the bogey where grren cake could be placed
if (currentTrackBuffer == null || 
		currentTrackBuffer.getFreeBogey() == null ||
		currentTrackBuffer.autoclave.isDisabled() ||
		currentTrackBuffer.autoclave.isOnMaintenance()) 
	currentTrackBuffer = getFreeTrackBuffer();
if (currentTrackBuffer == null) return null;
return currentTrackBuffer.getFreeBogey();