package com.navidroid.model.directions;

import com.navidroid.model.LatLng;
/*
InterFace
*/
public interface IDirectionsFactory {
	
	//傳入起點和目的地[經緯度]或中途點,回傳"請求網址"
	String createRequestUrl(LatLng origin, LatLng destination, LatLng rerouteWaypoint) throws Exception;
	
	//傳入起點和目的地[地址]或中途點,回傳"請求網址"
	String createRequestUrl(LatLng origin, String destinationAddress, LatLng rerouteWaypoint) throws Exception;
	
	//建立一個Directions物件
	Directions createDirections(LatLng origin, LatLng destination, String response) throws Exception;

}
