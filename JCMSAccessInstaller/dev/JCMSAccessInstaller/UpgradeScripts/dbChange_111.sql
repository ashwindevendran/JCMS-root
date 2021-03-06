#***
#Copyright (c) 2015 The Jackson Laboratory
#
#This is free software: you can redistribute it and/or modify it 
#under the terms of the GNU General Public License as published by  
#the Free Software Foundation, either version 3 of the License, or  
#(at your option) any later version.
# 
#This software is distributed in the hope that it will be useful,  
#but WITHOUT ANY WARRANTY; without even the implied warranty of 
#MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU 
#General Public License for more details.
#
#You should have received a copy of the GNU General Public License 
#along with this software.  If not, see <http://www.gnu.org/licenses/>.
#***
UPDATE Mating SET _crossStatus_key = (SELECT _crossStatus_key FROM cv_CrossStatus WHERE crossStatus = 'retired') WHERE retiredDate IS NOT NULL;

UPDATE dbInfo SET
	dbVers = 111,
	versDate = now(),
	releaseNum = '6.1.0',
	webReleaseNum = '3.0.2',
	releaseDate = '2013-11-18 00:00:00'
    WHERE _dbinfo_key = 1
;