import React from 'react'
import { Dropdown, Menu,Image } from 'semantic-ui-react'

export default function SignedIn({signOut}) {
    return (
        <div>
            <Menu.Item>
                <Image avatar spaced="right" src="https://i.tmgrup.com.tr/gq/original/17-06/22/user_male_circle_filled1600.png"/>
            <Dropdown pointing="top left" text="Ömer Faruk">
                <Dropdown.Menu>
                    <Dropdown.Item text="Bilgilerim" icon="info"/>
                    <Dropdown.Item onClick={FsignOut} text="Çıkış Yap" icon="sign-out"/>
                </Dropdown.Menu>
            </Dropdown>
            </Menu.Item>
        </div>
    )
}
