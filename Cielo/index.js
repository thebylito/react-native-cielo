
import React, { Component } from 'react'
import { requireNativeComponent, ViewPropTypes, UIManager, findNodeHandle, NativeModules } from 'react-native';
import PropTypes from 'prop-types'

const { RNCielo } = NativeModules;

const iface = {
  name: 'RNCieloManager',
  propTypes: {
      prop: PropTypes.string,
      ...ViewPropTypes
  }

};
const RCTRNCielo = requireNativeComponent('RNCieloManager', iface);

class RNCieloView extends Component {


  start = () => {
      UIManager.dispatchViewManagerCommand(
          findNodeHandle(this),
          UIManager.RNCieloManager.Commands.name,
          [],
      );
  }

  pause = () => {
      UIManager.dispatchViewManagerCommand(
          findNodeHandle(this),
          UIManager.RNCieloManager.Commands.name2,
          [],
      );
  }

  render() {
      return <RCTRNCielo ref={myView => { this.myView = myView }} {...this.props} />
  }
}


export default RNCieloView;
export { RNCielo };





















