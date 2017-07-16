
package com.soranko.service;

import com.soranko.model.Train;

import java.util.List;

/**
 * Created by kallesoranko on 16/07/2017.
 */


public interface TrainService {

    Train findBytrainNumber(int trainNumber);

}
