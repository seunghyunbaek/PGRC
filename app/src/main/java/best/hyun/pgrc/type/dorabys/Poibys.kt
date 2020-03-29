package best.hyun.pgrc.type.dorabys

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Poibys : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_poibys)
    override val type: PET_TYPE
        get() = PET_TYPE.DORABYS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_poibys)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 51
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1415
    override val maxLvMaxAtk: Int
        get() = 332
    override val maxLvMaxDef: Int
        get() = 252
    override val maxLvMaxSpd: Int
        get() = 202
    override val initLvMinHp: Int
        get() = 40
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1205
    override val maxLvMinAtk: Int
        get() = 294
    override val maxLvMinDef: Int
        get() = 214
    override val maxLvMinSpd: Int
        get() = 171
    override val minAllGrowth: Double
        get() = 4.765
    override val maxAllGrowth: Double
        get() = 5.472
}