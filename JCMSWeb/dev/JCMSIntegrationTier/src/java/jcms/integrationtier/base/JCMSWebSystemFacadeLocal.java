/****
Copyright (c) 2015 The Jackson Laboratory

This is free software: you can redistribute it and/or modify it 
under the terms of the GNU General Public License as published by  
the Free Software Foundation, either version 3 of the License, or  
(at your option) any later version.
 
This software is distributed in the hope that it will be useful,  
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU 
General Public License for more details.

You should have received a copy of the GNU General Public License 
along with this software.  If not, see <http://www.gnu.org/licenses/>.
****/

package jcms.integrationtier.base;

import java.sql.SQLException;
import javax.ejb.Local;
import javax.servlet.jsp.jstl.sql.Result;
import jcms.integrationtier.dto.UserDTO;
import jcms.integrationtier.jcmsWeb.DbInfoEntity;

/**
 * <b>File name:</b>   JCMSWebSystemFacadeLocal.java  <p>
 * <b>RsDate developed:</b>  October 2010 <p>
 * <b>Purpose:</b>  Provides a single access point to many general methods to get data.  <p>
 * <b>Overview:</b>  As more and more methods are added to this facade the time
 *      will come when a more logical container (facade) will be created to
 *      streamline these methods to system level methods.  System level methods
 *      should have a generic twist about them but may also reside based on the
 *      frequency of use.  <p>
 * <b>Last changed by:</b>   $Author: rkavitha $ <p>
 * <b>Last changed date:</b> $Date: 2010-10-25 16:16:15 -0400 (Mon, 25 Oct 2010) $   <p>
 * @author Kavitha Rama
 * @version $Revision: 11381 $
 */
@Local
public interface JCMSWebSystemFacadeLocal extends ITJCMSWebBaseFacadeLocal {

    DbInfoEntity getDbInfo();  
    /**
     * <b>Purpose:</b>  Find the user identified by <code>networkID</code>. <br />
     * <b>Overview:</b>  Find the user identified by <code>networkID</code>.
     *      Null is returned if the user is not found.  <p />
     * @param userName The user name of the user being sought
     * @return <code>UserDTO</code> describing the user matching <code>
     *         networkID</code>
     */
    public UserDTO findUser( String userName );

    Result findWorkgroupsForUser(String user) throws SQLException;
    
}