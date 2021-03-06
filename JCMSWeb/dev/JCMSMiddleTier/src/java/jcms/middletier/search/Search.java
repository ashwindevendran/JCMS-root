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

package jcms.middletier.search;

import java.util.ArrayList;
import java.util.List;
import jcms.middletier.dto.filter.FilterDTO;

/**
 * <b>File name:</b>  Search.java  <p>
 * <b>RsDate developed:</b>  October 2009 <p>
 * <b>Purpose:</b>    <p>
 * <b>Inputs:</b>     <p>
 * <b>Outputs:</b>    <p>
 * <b>Last changed by:</b>   $Author$ <p>
 * <b>Last changed date:</b> $Date$   <p>
 * @author Craig Hanna
 * @version $Revision$
 */
public class Search 
{
    private List<FilterDTO> filterList = null;

    public void addFilter(FilterDTO filter)
    {
        if (getFilterList() == null)
            setFilterList(new ArrayList<FilterDTO>());

        getFilterList().add(filter);
    }

    public FilterDTO getNextFilter()
    {

        return new FilterDTO();
    }

    /**
     * @return the filterList
     */
    public List<FilterDTO> getFilterList() {
        return filterList;
    }

    /**
     * @param filterList the filterList to set
     */
    public void setFilterList(List<FilterDTO> filterList) {
        this.filterList = filterList;
    }

}
