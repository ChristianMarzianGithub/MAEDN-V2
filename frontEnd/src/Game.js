import React, { Component } from 'react';
import './Game.css'

export default class Game extends Component {
  displayName = Game.name

  render() {
    return (
		<table >
			<tr>
			  <td id='a1Start'>a1</td>
			  <td id='a2Start'>a2</td>
			  <td></td>
			  <td ></td>
			  <td id='feld9'>9</td>
			  <td id='feld10'>10</td>
			  <td class='bStartPoint' id='feld11'>11</td>
			  <td></td>
			  <td></td>
			  <td id='b1Start'>b1</td>
			  <td id='b2Start'>b2</td>
			</tr>
			<tr>
			  <td id='a3Start'>a3</td>
			  <td id='a4Start'>a4</td>
			  <td></td>			  
			  <td></td>
			  <td id='feld8'>8</td>
			  <td id='b1Finish'>B1</td>
			  <td id='feld12'>12</td>
			  <td></td>
			  <td></td>
			  <td id='b3Start'>b3</td>
			  <td id='b4Start'>b4</td>
			</tr>
			<tr>
			  <td></td>
			  <td></td>
			  <td></td>			  
			  <td></td>
			  <td id='feld7'>7</td>
			  <td id='b2Finish'>B2</td>
			  <td id='feld13'>13</td>
			  <td></td>
			  <td></td>
			  <td></td>
			  <td></td>
			</tr>
			<tr>
			  <td></td>
			  <td></td>
			  <td></td>			  
			  <td></td>
			  <td id='feld6'>6</td>
			  <td id='b3Finish'>B3</td>
			  <td id='feld14'>14</td>
			  <td></td>
			  <td></td>
			  <td></td>
			  <td></td>
			</tr>
			<tr>
			  <td class='aStartPoint' id='feld1' >1</td>
			  <td id='feld2'>2</td>
			  <td id='feld3'>3</td>
			  <td id='feld4'>4</td>
			  <td id='feld5'>5</td>
			  <td id='b4Finish'>B4</td>
			  <td id='feld15'>15</td>
			  <td id='feld16'>16</td>
			  <td id='feld17'>17</td>
			  <td id='feld18'>18</td>
			  <td id='feld19'>19</td>
			</tr>
			<tr>
			  <td id='feld40'>40</td>
			  <td id='a1Finish'>A1</td>
			  <td id='a2Finish'>A2</td>
			  <td id='a3Finish'>A3</td>
			  <td id='a4Finish'>A4</td>
			  <td></td>
			  <td id='c1Finish'>C1</td>
			  <td id='c2Finish'>C2</td>
			  <td id='c3Finish'>C3</td>
			  <td id='c4Finish'>C4</td>
			  <td id='feld21'>21</td>
			</tr>
			<tr>
			  <td id='feld39'>39</td>
			  <td id='feld38'>38</td>
			  <td id='feld37'>37</td>
			  <td id='feld36'>36</td>
			  <td id='feld35'>35</td>
			  <td id='d1Finish'>D1</td>
			  <td id='feld26'>26</td>
			  <td id='feld25'>25</td>
			  <td id='feld24'>24</td>
			  <td id='feld23'>23</td>
			  <td class='cStartPoint' id='feld22'>22</td>
			</tr>
			<tr>
			  <td></td>
			  <td></td>
			  <td></td>
			  <td></td>
			  <td id='feld34'>34</td>
			  <td id='d2Finish'>D2</td>
			  <td id='feld27'>27</td>
			  <td></td>
			  <td></td>
			  <td></td>
			  <td></td>
			</tr>
			<tr>
			  <td></td>
			  <td></td>
			  <td></td>
			  <td></td>			  
			  <td id='feld33'>33</td>			  
			  <td id='d3Finish'>D3</td>
			  <td id='feld28'>28</td>
			  <td></td>
			  <td></td>
			  <td></td>
			  <td></td>
			</tr>
			<tr>
			  <td id='d1Start'>d1</td>
			  <td id='d2Start'>d2</td>
			  <td></td>
			  <td></td>
			  <td id='feld32'>32</td>
			  <td id='d4Finish'>D4</td>
			  <td id='feld29'>29</td>
			  <td></td>
			  <td></td>
			  <td id='c1Start'>c1</td>
			  <td id='c2Start'>c2</td>
			</tr>
			<tr>
			  <td id='d3Start'>d3</td>
			  <td id='d4Start'>d4</td>
			  <td></td>
			  <td></td>
			  <td class='dStartPoint' id='feld31'>31</td>
			  <td id='feld30'>30</td>
			  <td id='feld29'>29</td>
			  <td></td>
			  <td></td>
			  <td id='c3Start'>c4</td>
			  <td id='c4Start'>c3</td>
			</tr>
		</table>
    );
  }
}