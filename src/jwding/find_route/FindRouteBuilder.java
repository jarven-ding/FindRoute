package jwding.find_route;

import jwding.find_route.cal_route.IFindRoute;
import jwding.find_route.cal_route.imp.FindRoutePass;
import jwding.find_route.common.ObstacleAvoidanceType;

public class FindRouteBuilder{

    IFindRoute build(ObstacleAvoidanceType obstacleAvoidanceType) {
        return new FindRoutePass();
    }

}
