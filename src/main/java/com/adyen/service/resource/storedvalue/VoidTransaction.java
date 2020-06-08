/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2020 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.service.resource.storedvalue;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

import java.util.Arrays;


public class VoidTransaction extends Resource {

    public VoidTransaction(Service service) {
        super(service,
                service.getClient().getConfig().getEndpoint() + Client.STORED_VALUE_PAL_SUFFIX + Client.STORED_VALUE_PAL_VERSION + "/voidTransaction",
                Arrays.asList("merchantAccount", "originalReference"));
    }

}
