/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2016
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.services.nms.security;

import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinition;
import com.ericsson.oss.itpf.modeling.annotation.configparam.ConfParamDefinitions;
import com.ericsson.oss.itpf.modeling.annotation.configparam.Scope;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Max;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Min;

@EModel(namespace = "identity-management", description = "Configuration Parameters for identitymgmtservices application")
@ConfParamDefinitions
public class IdentityMgmtConfiguration {

    private static final String PROXY_ACCOUNT_PWD_LEN_DEFAULT = "24";
    private static final String PROXY_ACCOUNT_EXCESSIVE_ENTRIES_THRESHOLD_DEFAULT = "30000";
    private static final String PROXY_ACCOUNT_CREATE_ON_LEGACY_SUBTREE = "false";

    @ConfParamDefinition(description = "Proxy Account Password length", scope = Scope.GLOBAL)
    @Min(8)
    @Max(64)
    @DefaultValue(PROXY_ACCOUNT_PWD_LEN_DEFAULT)
    public int proxyAccountPwdLen;

    @ConfParamDefinition(description = "Proxy Account Excessive Entries Threshold", scope = Scope.GLOBAL)
    @Min(0)
    @DefaultValue(PROXY_ACCOUNT_EXCESSIVE_ENTRIES_THRESHOLD_DEFAULT)
    public int proxyAccountExcessiveEntriesThreshold;

    @ConfParamDefinition(description = "Proxy Account Creation Subtree Switch", scope = Scope.GLOBAL)
    @DefaultValue(PROXY_ACCOUNT_CREATE_ON_LEGACY_SUBTREE)
    public boolean switchOnLegacySubtree;

}
